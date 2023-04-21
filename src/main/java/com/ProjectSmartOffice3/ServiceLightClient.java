package com.ProjectSmartOffice3;

import  java.util.concurrent.TimeUnit;
import com.ProjectSmartOffice3.SmartOfficeLightServiceGrpc.SmartOfficeLightServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ServiceLightClient {
	
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50053;
		
		ManagedChannel channel  = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();
		
		SmartOfficeLightServiceBlockingStub blockingstub = 
				SmartOfficeLightServiceGrpc.newBlockingStub(channel);
		
		System.out.println("---The Light service is starting:---");
		
		try { 
			//Get the answer if the light is ON or OFF
			SetLightRequest request = SetLightRequest.newBuilder().setRoomId("ON")
					.build();
			
			SetLightResponse reply = blockingstub.setRoomLight (request);
			
			System.out.println("Message from the server - " + reply.getLight());
			
			
			// Request to change the weather
			
			SetTemperatureRequest request1 = SetTemperatureRequest.newBuilder().setTemperature("22C")
					.build();
			SetTemperatureResponse reply1 = blockingstub.setRoomTemperature(request1);
			
			System.out.println ("Message from the server - " + reply1.getTemperature());
			
			
			// Request 
			
			RoomLightRequest request2 = RoomLightRequest.newBuilder().setLightState("The lights of the office will turn off in 30 minutes")
					.build();
			String reply2 = blockingstub.toString();
					
			System.out.println ("Message from the server - " + request2.toString());
			
			
			
			
			
		} catch (StatusRuntimeException e) {
        	System.out.println("Error: " + e.getStatus());
			} finally {
				try { 
					channel.shutdown().awaitTermination(2, TimeUnit.SECONDS);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		}
}

