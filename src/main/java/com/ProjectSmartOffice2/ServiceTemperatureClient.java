package com.ProjectSmartOffice2;

import com.ProjectSmartOffice2.TemperatureAverageRequest;
import com.ProjectSmartOffice2.TemperatureAverageResponse;
import com.ProjectSmartOffice2.TemperatureRangeRequest;
import com.ProjectSmartOffice2.TemperatureRangeResponse;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ServiceTemperatureClient {

    private static com.ProjectSmartOffice2.SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceBlockingStub blockingStub;
    private static SmartOfficeTemperatureServiceGrpc.SmartOfficeTemperatureServiceStub asyncStub;

    public static void main(String[] args) {
        String host = "localhost";
        int port = 50052;

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext().build();

        blockingStub = SmartOfficeTemperatureServiceGrpc.newBlockingStub(channel);
        asyncStub = SmartOfficeTemperatureServiceGrpc.newStub(channel);

        // Call the temperature methods here
    }

    public static void getTemperature() {
        TemperatureAverageRequest request = TemperatureAverageRequest.newBuilder().build();
        StreamObserver<TemperatureAverageResponse> responseObserver = new StreamObserver<TemperatureAverageResponse>() {
            @Override
            public void onNext(TemperatureAverageResponse value) {
                System.out.println("Receiving the average temperature: " + value.getAverageTemperature());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Task completed");
            }
        };
        asyncStub.getTemperature(responseObserver);
    }

    public static void checkTemperatureRange() {
        TemperatureRangeRequest request = TemperatureRangeRequest.newBuilder().build();
        StreamObserver<TemperatureRangeResponse> responseObserver = new StreamObserver<TemperatureRangeResponse>() {
            @Override
            public void onNext(TemperatureRangeResponse value) {
                System.out.println("Showing if the fixed temperature is inside of the range: " + value.getRange());
            }

            @Override
            public void onError(Throwable t) {
                t.printStackTrace();
            }

            @Override
            public void onCompleted() {
                System.out.println("Range Completed");
            }
        };
        asyncStub.checkTemperatureRange(responseObserver);
    }
}

			
			
