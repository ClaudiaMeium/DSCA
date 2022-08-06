package ds.service3;

import java.io.IOException;
import java.util.Random;

import ds.service3.Service3Grpc.Service3ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//this class extends the ImplBase imported class, which is the interface with the needed rpc methods
public class Service3 extends Service3ImplBase{


	//main method
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//create an instance of the Service3 file by which to invoke methods
		Service3 service1 = new Service3();

		//this is our port, where the server will listen to clients
		int port = 50053;

		//creating a server on the port and attaching the service to it
		Server server = ServerBuilder.forPort(port) //our port, defined above
				.addService(service1)// adding service
				.build() //building the server
				.start(); //starting the server and keep running for clients to connect

		//notifying that service started and listening 
		System.out.println("Intrusion Detection Service started, listening on " + port);

		//server will run until it is terminated 
		server.awaitTermination();
	}

	//rpc methods from the proto files - interface in the implbase file
	@Override
	public StreamObserver<SensorRequest> motionSensor(StreamObserver<SensorResponse> responseObserver) {
		
		//retrieve value from client's stream of requests
		return new StreamObserver<SensorRequest>() {
			//boolean noDisturbance = true;
			String update = "beginning value";
			//go through the stream one message at a time
			@Override
			public void onNext(SensorRequest status) {
				
				//here, check the boolean value the sensor is sending?
				System.out.println("Current Motion Sensor Status:");
				if (status.getNoDisturbance() == false) {
					System.out.println("Disturbance Detected. Security Notified");
					update = "Disturbance Detected. Security Notified.";
				} else {
					System.out.println("No Disturbance Detected.");
				}

			}
			
			@Override
			public void onError(Throwable t) {
				//TODO implement something here 
			}
			
			@Override 
			public void onCompleted() {

				//preparing and sending response to client
				SensorResponse response = SensorResponse.newBuilder().setResponse(update).build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				
			}
		};
		
		
		
		
		//return super.motionSensor(responseObserver);
	}

	@Override
	public void sensorLogCheck(SensorLogRequest request, StreamObserver<SensorLogResponse> responseObserver) {
		System.out.println("Request Received: " + request.getRequest());

		String[] update = new String [60];
		for(int i = 0; i <update.length-1; i++) {
			update[i] = "true";
		}
		int random = new Random().nextInt(update.length);
		update[random]= "false";
		
		for(int i = 0; i <update.length-1; i++) {
			//System.out.println(update[i]);
			//consider an if-else to allow more meaningful feedback? but would that be here or in the client?
			responseObserver.onNext(SensorLogResponse.newBuilder().setResponse(update[i]).build());
		}
		
		responseObserver.onCompleted();
		
		
		// TODO Auto-generated method stub
		//super.sensorLogCheck(request, responseObserver);
	}


/*	@Override
	public void service3Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}*/
}
