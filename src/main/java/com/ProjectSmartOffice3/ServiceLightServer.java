package com.ProjectSmartOffice3; 

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.ProjectSmartOffice.ServiceConsumptionServer;
import com.ProjectSmartOffice3.SmartOfficeLightServiceGrpc.SmartOfficeLightServiceImplBase;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceLightServer extends SmartOfficeLightServiceImplBase {
	
	public static void main(String[] args) {
		
		ServiceLightServer lightserver = new ServiceLightServer(); {
			int port = 50053;
			Server server;
			try {
				server = ServerBuilder.forPort(port).addService(lightserver).build().start();
				System.out.println("Light server started..");
				server.awaitTermination();
			} catch (IOException | InterruptedException e) {
	// TODO Auto-generated catch block
				e.printStackTrace();
			}}
		}
	
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