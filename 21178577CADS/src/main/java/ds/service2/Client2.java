package ds.service2;

import java.util.logging.Logger;

import ds.service1.Service1;
import ds.service1.Service1Grpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Client2 {

	//optional logger to show client side logs in console
	private static Logger logger = Logger.getLogger(Service1.class.getName());
	
	//creating stubs by which to establish connection with server
	//blocking stub (for when want to wait for messages before sending)
	private static Service2Grpc.Service2BlockingStub blockingStub;
	//asynch stub, for messages sent back and forth without waiting
	private static Service2Grpc.Service2Stub asyncStub;
	
	//main method
	public static void main(String[] args) throws Exception{
		//first, create a channel to server
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
		
		//here our stubs
		blockingStub = Service2Grpc.newBlockingStub(channel);
		asyncStub = Service2Grpc.newStub(channel);
		
		//unary rpc call
		tempStatusCheck();
		
		humidStatusCheck();
		
		lightStatusCheck();
		
		channel.shutdown();
		
	}
	
	public static void tempStatusCheck() {
		//create request message
		TempStatRequest request = TempStatRequest.newBuilder().setRequest(" What is the current temperature of the archives? ").build();
		
		//invoking the remote rpc method using the blocking stub from our main method
		TempStatResponse response = blockingStub.tempStatusCheck(request);
		
		//displaying the response from the server
		System.out.println("The current temperature of the archives is: " + response.getReponse() + " degrees celsius.");
	
	}
	
	public static void humidStatusCheck() {
		//create request message
		HumidStatRequest request = HumidStatRequest.newBuilder().setRequest(" What is the current humidity of the archives? ").build();
		
		//invoking the remote rpc method using the blocking stub from our main method
		HumidStatResponse response = blockingStub.humidStatusCheck(request);
		
		//displaying the response from the server
		System.out.println("The current humidity of the archives is: " + response.getResponse() + " percent humidity.");
	
	}
	
	public static void lightStatusCheck() {
		//create request message
		LightStatRequest request = LightStatRequest.newBuilder().setRequest(" What is the current light intensity of the archives? ").build();
		
		//invoking the remote rpc method using the blocking stub from our main method
		LightStatResponse response = blockingStub.lightStatusCheck(request);
		
		//displaying the response from the server
		System.out.println("The current humidity of the archives is: " + response.getResponse() + " lux, or " + (response.getResponse()/10) + "." + response.getResponse()%10 + " footcandles.");
	
	}
	
}
