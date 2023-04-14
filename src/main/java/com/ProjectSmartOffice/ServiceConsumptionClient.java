package com.ProjectSmartOffice;

import  java.util.concurrent.TimeUnit;
import com.ProjectSmartOffice.SmartOfficeElectricityServiceGrpc.SmartOfficeElectricityServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ServiceConsumptionClient {

	public static void main(String[] args) {
		String host = "localhost";
		int port = 50051;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		SmartOfficeElectricityServiceBlockingStub blockingstub = 
				SmartOfficeElectricityServiceGrpc.newBlockingStub(channel);
		
		System.out.println("---Electricity Service starting---");
		
		try {
			//Get Current Consumption
			
			ConsumptionRequest request = ConsumptionRequest.newBuilder().setConsumptionValue
					("The actual consumption is 14,000 watts").build();

			ConsumptionResponse reply = blockingstub.getCurrentConsumption(request);
			
			System.out.println("Message from the server " + reply.getConsumption());
			
			//Get Max Consumption
			
			MaxConsumptionRequest MaxRequest = MaxConsumptionRequest.newBuilder()
					.setConsumptionValue("The Maximum consumption registered is 32,000watts").build();
			
			MaxConsumptionResponse MaxReply = blockingstub.getMaxConsumption(MaxRequest);
			
			System.out.println("Message from the server Max " + MaxReply.getMaxConsumption());
			
			//Get Min Consumption
			
			MinConsumptionRequest MinRequest = MinConsumptionRequest.newBuilder()
					.setConsumptionValue("The Minimum consumption registered is 10,000watts").build();
			
			MinConsumptionResponse MinReply = blockingstub.getMinConsumption(MinRequest);
			
			System.out.println("Message from the server Min" + MinReply.getMinConsumption());
			
		} catch (StatusRuntimeException e) {
        	System.out.println("Error: " + e.getStatus());
			} finally {
				try { 
					channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
				}catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
	}
}
