package com.ProjectSmartOffice3; 

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import com.ProjectSmartOffice.ServiceConsumptionServer;
import com.ProjectSmartOffice3.SmartOfficeLightServiceGrpc.SmartOfficeLightServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceLightServer extends SmartOfficeLightServiceImplBase {
	
	public static void main(String[] args) {
		
		ServiceLightServer SmartOfficeLightServer = new ServiceLightServer();
		
		Properties prop = SmartOfficeLightServer.getProperties();
		
		SmartOfficeLightServer.registerService3(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));
		
		
		try {
			Server server = ServerBuilder.forPort(port).addService(SmartOfficeLightServer).build().start();
			System.out.println("Light Server started..");
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
		try(InputStream input = new FileInputStream("src/main/resources/servicelight.properties")){
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
		
	private void registerService3(Properties prop) {
		try {
			//Create a JmDNS instance
						JmDNS jmdns = JmDNS.create(InetAddress.getLocalHost());

						String service_type = prop.getProperty("service_type");
						String service_name = prop.getProperty("service_name");

						int service_port = Integer.valueOf(prop.getProperty("service_port"));
						String service_description_properties = prop.getProperty("service_description");

			//Register a service
						ServiceInfo serviceInfo = ServiceInfo.create(service_type, service_name, service_port,
								service_description_properties);
						jmdns.registerService(serviceInfo);

						System.out.printf("Registering the service type %s with the name %s \n", service_type, service_name);

			//Wait a 1 second
						Thread.sleep(500);

					} catch (IOException e) {
						System.out.println(e.getMessage());
					} catch (InterruptedException e) {
			//TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		
	
	//Unary RPC
	
	public void setRoomLight(SetLightRequest request, 
			StreamObserver<SetLightResponse> responseObserver) {
		System.out.println("--- Receiving the Light Status ---");
		SetLightResponse replay = SetLightResponse.newBuilder()
				.setLight("The light is : " + request.getRoomId()).build();
		responseObserver.onNext(replay);
		responseObserver.onCompleted();
		
	}

	@Override
	public void setRoomTemperature(SetTemperatureRequest request,
			StreamObserver<SetTemperatureResponse> responseObserver) {
		System.out.println("---Seting the new temperature --");
		SetTemperatureResponse replay = SetTemperatureResponse.newBuilder()
				.setTemperature("Setting the temperature to: " + request.getTemperature()).build();
		responseObserver.onNext(replay);
		responseObserver.onCompleted();
		
	}

	@Override
	public StreamObserver<RoomLightRequest> controlRoomLight(StreamObserver<RoomLightResponse> responseObserver) {
	    StreamObserver<RoomLightRequest> requestObserver = new StreamObserver <RoomLightRequest>() {

	        @Override
	        public void onNext(RoomLightRequest value) {
	            // In bidirectional stream, both server and client would be sending the stream of messages.
	            // Here, for each message in stream from client, server is sending back one response.
	            String response = "The room light is turned ON, " + value.getLightState() + " Thank you";

	            // Preparing and sending the reply for the client. Here, response is built with the value (input1.toString()) computed by above logic.
	            RoomLightResponse response1 = RoomLightResponse.newBuilder().setLightState(response).build();

	            responseObserver.onNext(response1);
	        }

	        @Override
	        public void onError(Throwable t) {
	            // TODO Auto-generated method stub
	        }

	        @Override
	        public void onCompleted() {
	            responseObserver.onCompleted();
	        }
	    };
	    
	    return requestObserver;
	}
}