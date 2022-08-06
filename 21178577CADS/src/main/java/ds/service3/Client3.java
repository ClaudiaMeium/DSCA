package ds.service3;

import java.util.Iterator;
import java.util.Random;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

public class Client3 {

	//create stubs for creating connection with server
	private static Service3Grpc.Service3BlockingStub blockingStub; //blocking stub
	private static Service3Grpc.Service3Stub asyncStub; //async stub
	
	//main method for the client's implementation
	public static void main(String[] args) throws Exception{
		//first, create channel from client to server
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
	
		//generate stubs from proto
		blockingStub = Service3Grpc.newBlockingStub(channel);
		asyncStub = Service3Grpc.newStub(channel);
		
		//client steaming method call
		motionSensor();
		
		//server streaming method call
		sensorLogCheck();
		
		
		//closing channel when messages finished
		channel.shutdown();
	
	
	
	}
	
	
	public static void motionSensor() {
		
		//to handle each message in the stream with onNext
		StreamObserver<SensorResponse> responseObserver = new StreamObserver<SensorResponse>() {
			
			@Override
			public void onNext(SensorResponse status) {
				System.out.println(status.getResponse());
			}
			
			@Override
			public void onError(Throwable t) {
				
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Status Update Complete");
			}
		};
		
		//calling remote response method with stub
		//using onNext, client is able to send stream of messages
		//would this work better as a blocking stub?
		//or something so that it stops when the boolean becomes false 
		StreamObserver<SensorRequest> requestObserver = asyncStub.motionSensor(responseObserver);
		
		try {
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(true).build());
			requestObserver.onNext(SensorRequest.newBuilder().setNoDisturbance(false).build());
			
			System.out.println("Sending Continuous Status Updates");
			
			//end of requests/status updates
			requestObserver.onCompleted();
			
			//sleep for a bit in between updates
			//this is directly from the grpc class example
			Thread.sleep(new Random().nextInt(1000)+ 500);
			
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	//async example again (edited out below.  needs more work)
	public static void sensorLogCheck() {
		
		//first creating the request message for client to send to server
		SensorLogRequest request = SensorLogRequest.newBuilder().setRequest("Sensor Log Request").build();
		
		//blocking example
		try {
			Iterator<SensorLogResponse> responses = blockingStub.sensorLogCheck(request);
			
			//client keeps check on next message in stream
			while(responses.hasNext()) {
				SensorLogResponse current = responses.next();
				System.out.println("No Disturbance Detected: " + current.getResponse());
			}
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		//async beginning here.  but maybe the blocking above works better?
		//handle the stream of messages from the server using the onNext logic, which handles each message (and on complete when completed)
		/*StreamObserver<SensorLogResponse> responseObserver = new StreamObserver<SensorLogResponse>() {
			
			
			@Override 
			public void onNext(SensorLogResponse reply) {
				System.out.println("Receiving Sensor Log Items");
				
				
			}
			
			@Override
			public void onError(Throwable t) {
				t.printStackTrace();
			}
			
			@Override
			public void onCompleted() {
				System.out.println("Completed");
				
			}
			
			
		};
		
		//here, calling the remote method with the stub.  onNext, onError, and onCompleted will be call as needed from above
		asyncStub.sensorLogCheck(request, responseObserver);
		
		//try {
			
		//}catch (InterruptedException e) {
			//e.printStackTrace();
		//}*/
		
	}
	
	
}
