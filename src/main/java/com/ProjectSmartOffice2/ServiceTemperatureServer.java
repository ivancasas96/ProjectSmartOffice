package com.ProjectSmartOffice2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.ProjectSmartOffice2.SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceTemperatureServer extends SmartOfficeTemperatureServiceImplBase {
	public static void main(String[] args) {
		ServiceTemperatureServer temperatureserver = new ServiceTemperatureServer();
		int port = 50052;
		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(temperatureserver).build().start();
			System.out.println("Temperature server started..");
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
// TODO Auto-generated catch block
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
// Retrieve the value from the stream of requests of the client. 
		final double[] avg = { 0 };
		return new StreamObserver<TemperatureAverageRequest>() {
// For each message in the stream, get one stream at a time.
// NOTE: YOU MAY MODIFY THE LOGIC OF onNext, onError, onCompleted BASED ON YOUR PROJECT.
			@Override
			public void onNext(TemperatureAverageRequest value) {
// Here, in this example we compute the value of string length for each message in the stream. 
				System.out.println("receiving data 1 -> " + value.getTemperatures() + " receiving data 2 " + value.getTemperatures2() + " "
						+ value.getTemperatures3());
// Keep on adding all the length values to compute the total length of strings sent by the client in the stream 
				avg[0] = (value.getTemperatures() + value.getTemperatures2() + value.getTemperatures3()) / 3;

			}

			@Override
			public void onError(Throwable t) {
// TODO Auto-generated method stub
			}

// Once the complete stream is received this logic will be executed.
			@Override
			public void onCompleted() {
// Preparing and sending the reply for the client. Here, response is build and with the value (length) computed by above logic.
// Here, response is sent once the client is done with sending the stream.
				TemperatureAverageResponse res = TemperatureAverageResponse.newBuilder().setAverageTemperature(avg[0])
						.build();
				responseObserver.onNext(res);
				responseObserver.onCompleted();
			}
		};
}

	@Override
	public StreamObserver<TemperatureRangeRequest> checkTemperatureRange(StreamObserver<TemperatureRangeResponse> responseObserver) {
	    
	    return new StreamObserver<TemperatureRangeRequest>() {
	        @Override
	        public void onNext(TemperatureRangeRequest value) {
	            System.out.println("Receiving the Range " + value.getRangetemperatures() + " " + value.getLowerRange() + " " + value.getUpperRange());
	            boolean withinRange = false;
	             
	                if ( value.getRangetemperatures() < value.getLowerRange() && value.getRangetemperatures() > value.getUpperRange()) {
	                    withinRange = true;
	      
	                }
	            
	            TemperatureRangeResponse response = TemperatureRangeResponse.newBuilder()
	                    .setRange(withinRange)
	                    .build();
	            responseObserver.onNext(response);
	        }

	        @Override
	        public void onError(Throwable t) {
	            // Handle error
	        }

	        @Override
	        public void onCompleted() {
	            responseObserver.onCompleted();
	        }
	    };
	}
}
