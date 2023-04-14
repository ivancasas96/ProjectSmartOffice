package com.ProjectSmartOffice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

import io.grpc.stub.StreamObserver;
import com.ProjectSmartOffice.SmartOfficeElectricityServiceGrpc.SmartOfficeElectricityServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServiceConsumptionServer extends SmartOfficeElectricityServiceImplBase {
	
	public static void main(String[] args) {
		
		ServiceConsumptionServer SmartOfficeElectricityService = new ServiceConsumptionServer();
		
		int port = 50051;
		Server server;
	
		try {
			server = ServerBuilder.forPort(port).addService(SmartOfficeElectricityService).build().start();
			System.out.println("Server started..");
			server.awaitTermination();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * private Properties getProperties() { Properties prop = null; try (InputStream
	 * input = new
	 * FileInputStream("src/main/resources/ServiceConsumption.properties")) { prop =
	 * new Properties(); //load a properties file prop.load(input); }
	 */
	// gRPC Unary

	@Override
	public void getCurrentConsumption(ConsumptionRequest request,
			StreamObserver<ConsumptionResponse> responseObserver) {
		System.out.println("--- Receiving the actual consumption---");
		ConsumptionResponse replay = ConsumptionResponse.newBuilder()
				.setConsumption("The consumption is: " + request.getConsumptionValue()).build();
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
		//super.getMinConsumption(request, responseObserver);
	}


}

