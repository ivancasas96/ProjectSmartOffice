package com.ProjectSmartOffice2;

import  java.util.concurrent.TimeUnit;
import com.ProjectSmartOffice.SmartOfficeElectricityServiceGrpc.SmartOfficeElectricityServiceBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class ServiceTemperatureClient {
	
	public static void main(String[] args) {
		String host = "localhost";
		int port = 50052;
		
		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
				.usePlaintext().build();
		
		blockingStub = SmartOfficeTemperatureServiceGrpc.newBlockingStub(channel);
		asyncStub = SmartOfficeTemperatureServiceGrpc.newStub(channel);
		
	}
		/*public static void StreamTemperatures(SmartOfficeElectricityServiceBlockingStub blockingStub) {
			
			TemperatureRequest request = TemperatureRequest.newBuilder().setTrequest
					("Requesting Temperature").build();
			
			StreamObserver<TemperatureResponse> responseObserver = new StreamObserver<TemperatureResponse>() {
				
				public void onNext(TemperatureResponse value) {
					System.out.println("Receiving the temperature from the office" + value.getTemperature());
				}
				
			@Override
			
		}
}*/
			public static void GetTemperature() {
				
				StreamObserver<TemperatureAverageResponse> responseObserver = new StreamObserver
						<TemperatureAverageResponse>() {
					
					@Override
					public void onNext(TemperatureAverageResponse value ) {
						System.out.println("Receiving the average temperature: " + value.getAverageTemperature());
					}

					@Override
					public void onCompleted() {
						System.out.println("Task completed");
						// TODO Auto-generated method stub
						
					}

					@Override
					public void onError(Throwable arg0) {
						// TODO Auto-generated method stub
						
					}
				};
				// Here we call the function onNext to stream messages
					
				
			
			public static void CheckTemperatureRange() {
				StreamObserver <TemperatureRangeResponse> responseObserver = new StreamObserver
						<TemperatureRangeResponse>() {
							
							@Override
							public void onNext(TemperatureRangeResponse value) {
							System.out.println("Showing if the fixed temperature is inside of the range: "
							+ value.getRange());
							}
								// TODO Auto-generated method stub
								
							
							@Override
							public void onCompleted() {
								System.out.println ("Range Completed");
							}
								// TODO Auto-generated method stub
								
							

							@Override
							public void onError(Throwable arg0) {
								// TODO Auto-generated method stub
								
							}
				}
							
		
			
			
