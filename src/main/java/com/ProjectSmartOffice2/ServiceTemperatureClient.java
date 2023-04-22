package com.ProjectSmartOffice2;

import com.ProjectSmartOffice2.SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceBlockingStub;
import com.ProjectSmartOffice2.TemperatureAverageRequest;
import com.ProjectSmartOffice2.TemperatureAverageResponse;
import com.ProjectSmartOffice2.TemperatureRangeRequest;
import com.ProjectSmartOffice2.TemperatureRangeResponse;

import java.util.Iterator;
import  java.util.concurrent.TimeUnit;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class ServiceTemperatureClient {

    //private static com.ProjectSmartOffice2.SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceBlockingStub blockingStub;
   // private static SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceStub asyncStub;

    public static void main(String[] args) {
        String host = "localhost";
        int port = 50052;

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext().build();
        
        SmartOfficeTemperatureServiceBlockingStub blockingstub = 
        		SmartOfficeTemperatureServiceGrpc.newBlockingStub(channel);
        
        System.out.println (" --- The Temperature service is starting---");
        
        try {
        	// Get the readings from the server
        	
        	TemperatureRequest request = TemperatureRequest.newBuilder().setTrequest
        			("The actual temperature from the office is: ").build();
        	
        	Iterator<TemperatureResponse> reply = blockingstub.streamTemperatures(request);
        	
        	System.out.println ("Message from the server - " + reply.getClass());
        	
        	
        	// Get the average temperature form the office
        	
        	TemperatureAverageRequest AvRequest = TemperatureAverageRequest.newBuilder()
        			.setTemperatures(22).build();
        	TemperatureAverageRequest AvRequest1 = TemperatureAverageRequest.newBuilder()
        			.setTemperatures2(18).build();
        	TemperatureAverageRequest AvRequest3 = TemperatureAverageRequest.newBuilder()
        			.setTemperatures3(32).build();
        	String AvReply = blockingstub.toString();
        	System.out.println("The average temperature is: 24 " + AvReply.toString());
        	
        	
        	// Set a range between temperatures so you can put an upper and lower limit
        	
        	TemperatureRangeRequest trequest = TemperatureRangeRequest.newBuilder()
        			.setRangetemperatures(22).build();
        	TemperatureRangeRequest trequest2 = TemperatureRangeRequest.newBuilder()
        			.setLowerRange(17).build();
        	TemperatureRangeRequest trequest3 = TemperatureRangeRequest.newBuilder()
        			.setUpperRange(30).build();
        	
        	String tresponse = blockingstub.toString();
        	System.out.println("Temperature is inside the limit" + tresponse.toString());
        	
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

