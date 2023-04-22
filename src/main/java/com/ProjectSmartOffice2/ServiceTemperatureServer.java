package com.ProjectSmartOffice2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.ProjectSmartOffice2.SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceImplBase;
import com.ProjectSmartOffice3.ServiceLightServer;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceTemperatureServer extends SmartOfficeTemperatureServiceImplBase {
	public static void main(String[] args) {
		
		ServiceTemperatureServer SmartOfficeTemperatureServer = new ServiceTemperatureServer();
		
		Properties prop = SmartOfficeTemperatureServer.getProperties();
		
		SmartOfficeTemperatureServer.registerService2(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));
		
		
		try {
			Server server = ServerBuilder.forPort(port).addService(SmartOfficeTemperatureServer).build().start();
			System.out.println("Temperature Server started..");
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private Properties getProperties() {
		Properties prop = null;
		try(InputStream input = new FileInputStream("src/main/resources/servicetemperature.properties")){
			prop = new Properties();
			
			prop.load(input);
			
			System.out.println("Starting the server..");
			System.out.println("\t Service: " + prop.getProperty("service_type"));
			System.out.println("\t Service name: " + prop.getProperty("service_name"));
			System.out.println("\t Description: " + prop.getProperty("service_description"));
			System.out.println("\t Port: " + prop.getProperty("service_port"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return prop;
	}
		
	private void registerService2(Properties prop) {
		try {
			//JmDNS 
						JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

						String service_type = prop.getProperty("service_type");
						String service_name = prop.getProperty("service_name");

						int service_port = Integer.valueOf(prop.getProperty("service_port"));
						String service_description_properties = prop.getProperty("service_description");

			//Service registration
						ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
								service_description_properties);
						jmdns.registerService(serviceInfo);

						System.out.printf("Registering the service type %s with the name %s \n", service_type, service_name);

			
						Thread.sleep(500);

					} catch (IOException e) {
						System.out.println(e.getMessage());
					} catch (InterruptedException e) {
			//TODO Auto-generated catch block
						e.printStackTrace();
					}
				}

	//private List<Double> temperatureReadings = new ArrayList<>();
	
	@Override
//Using Server Streaming to continuously stream the current temperature readings in the office
	
	public void streamTemperatures(TemperatureRequest request, StreamObserver<TemperatureResponse> responseObserver) {
	String morningtemperature = "21";
	String afternoontemperature ="23";
	System.out.println("--Receiving the split  ");
	    String tRequest = request.getTrequest();
	    
	        responseObserver.onNext(TemperatureResponse.newBuilder()
	        		.setAfternoontemperature("The morning temperature is: " + morningtemperature + 
	                		"The afternoon temperature is:" + afternoontemperature).build());
	    
	    responseObserver.onCompleted();
	}

	@Override
	public StreamObserver<TemperatureAverageRequest> getTemperature(
			StreamObserver<TemperatureAverageResponse> responseObserver) {
// TODO Auto-generated method stub
		final double[] avg = { 0 };
		return new StreamObserver<TemperatureAverageRequest>() {

	@Override
			public void onNext(TemperatureAverageRequest value) {
// Here, in this example we compute the value of string length for each message in the stream. 
				System.out.println("receiving data 1 -> " + value.getTemperatures() + " receiving data 2 " + value.getTemperatures2() + " "
						+ value.getTemperatures3());
// Adding all the length values to compute the total length of strings sent by the client in the stream 
				avg[0] = (value.getTemperatures() + value.getTemperatures2() + value.getTemperatures3()) / 3;

			}

			@Override
			public void onError(Throwable t) {
			}

			@Override
			public void onCompleted() {

				TemperatureAverageResponse res = TemperatureAverageResponse.newBuilder().setAverageTemperature(avg[0])
						.build();
				responseObserver.onNext(res);
				responseObserver.onCompleted();
			}
		};
}

	//Client Streaming
	@Override
	public StreamObserver<TemperatureRangeRequest> checkTemperatureRange(StreamObserver<TemperatureRangeResponse> responseObserver) {
	    
	    return new StreamObserver<TemperatureRangeRequest>() {
	        @Override
	        public void onNext(TemperatureRangeRequest value) {
	            System.out.println("Receiving the Range " + value.getRangetemperatures() + " " + value.getLowerRange() + " " + value.getUpperRange());
	            boolean withinRange = false;
	             
	                if ( value.getRangetemperatures() > value.getLowerRange() && value.getRangetemperatures() < value.getUpperRange()) {
	                    withinRange = true;
	      
	                }
	            
	            TemperatureRangeResponse response = TemperatureRangeResponse.newBuilder()
	                    .setRange(withinRange)
	                    .build();
	            responseObserver.onNext(response);
	        }

	        @Override
	        public void onError(Throwable t) {
	            // Error
	        }

	        @Override
	        public void onCompleted() {
	            responseObserver.onCompleted();
	        }
	    };
	}
}
