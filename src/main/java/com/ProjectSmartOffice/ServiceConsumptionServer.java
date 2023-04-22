package com.ProjectSmartOffice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.Properties;
import java.util.Set;

import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

import io.grpc.stub.StreamObserver;
import com.ProjectSmartOffice.SmartOfficeElectricityServiceGrpc.SmartOfficeElectricityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServiceConsumptionServer extends SmartOfficeElectricityServiceImplBase {
	
	public static void main(String[] args) {
		
		ServiceConsumptionServer SmartOfficeElectricityService = new ServiceConsumptionServer();
		
		Properties prop = SmartOfficeElectricityService.getProperties();
		
		SmartOfficeElectricityService.registerService1(prop);
		
		int port = Integer.valueOf(prop.getProperty("service_port"));
		
		
	
		try {
			Server server = ServerBuilder.forPort(port).addService(SmartOfficeElectricityService).build().start();
			System.out.println("Consumption Server started..");
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
		try(InputStream input = new FileInputStream("src/main/resources/serviceconsumption.properties")){
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
		
	private void registerService1(Properties prop) {
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
		

	

	
	// gRPC Unary

	@Override
	public void getCurrentConsumption(ConsumptionRequest request,
			StreamObserver<ConsumptionResponse> responseObserver) {
		System.out.println("--- Receiving the actual consumption---");
		ConsumptionResponse replay = ConsumptionResponse.newBuilder()
				.setConsumption("The new limit consumption is: " + request.getConsumptionValue()).build();
		responseObserver.onNext(replay);
		responseObserver.onCompleted();
		// TODO Auto-generated method stub
		//super.getCurrentConsumption(request, responseObserver);
	}

	@Override
	public void getMaxConsumption(MaxConsumptionRequest request,
			StreamObserver<MaxConsumptionResponse> responseObserver) {
		System.out.println("---Receiving the Max Consumption registered---");
		MaxConsumptionResponse response = MaxConsumptionResponse.newBuilder()
				.setMaxConsumption("The max consumption is: "+ request.getConsumptionValue()).build();
		responseObserver.onNext(response);
		responseObserver.onCompleted();
		// TODO Auto-generated method stub
		//super.getMaxConsumption(request, responseObserver);
	}

	@Override
	public void getMinConsumption(MinConsumptionRequest request,
			StreamObserver<MinConsumptionResponse> responseObserver) {
		System.out.println("--- Receiving the Min Consumption registered---");
		MinConsumptionResponse replay = MinConsumptionResponse.newBuilder()
				.setMinConsumption("The min consumption is: " + request.getConsumptionValue()).build();
		responseObserver.onNext(replay);
		responseObserver.onCompleted();
		// TODO Auto-generated method stub
		super.getMinConsumption(request, responseObserver);
	}


}

