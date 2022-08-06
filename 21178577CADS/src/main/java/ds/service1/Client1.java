package ds.service1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class Client1 {

	//optional logger to show client side logs in console
	private static Logger logger = Logger.getLogger(Service1.class.getName());
	
	//creating stubs by which to establish connection with server
	//blocking stub (for when want to wait for messages before sending)
	private static Service1Grpc.Service1BlockingStub blockingStub;
	//asynch stub, for messages sent back and forth without waiting
	private static Service1Grpc.Service1Stub asyncStub;
	
	//main method
	public static void main(String[] args) throws Exception{
		//first, create a channel to server
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
		
		//here our stubs
		blockingStub = Service1Grpc.newBlockingStub(channel);
		asyncStub = Service1Grpc.newStub(channel);
		
		//unary rpc call
		authoriseEntry();
		
		entryLogCheck();
		
		channel.shutdown();
		
	}
	
	public static void authoriseEntry() {
		//First create the request message
		//probably would be better to randomly generate something? see if can do so
		
		/*int left = 48; // for number '0' (beginning of int possibilities)
	    int right = 122; // for letter 'z' (end of letter possibilities)
	    int codeLength = 4;
	    Random random = new Random();

	    String attempt = random.ints(left, right + 1)
	    	//filter used to leave out Unicode characters between 65 and 90 to avoid out of range characters
	    	.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    	.limit(codeLength)
	    	.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    	.toString();*/
	    //with scanner for user input
		Scanner input = new Scanner(System.in);
	    System.out.println("Please enter your code attempt");
	    String attempt = input.next();
	    
	
		EntryRequest request = EntryRequest.newBuilder().setRequest(attempt).build();
		//call remote rpc method using blocking stub from main method
		EntryResponse response = blockingStub.authoriseEntry(request);
		
		//response contains the output from the server.
		System.out.println("Is this access authorised? " + response.getAuthorised());
		
	}
	
	public static void entryLogCheck() {
		//first, create request message
		EntryLogRequest request = EntryLogRequest.newBuilder().setRequest("Entry Log Check Request").build();
		
		//this call is blocking, so client receives all entry log attempts records in stream before can do anything else
		try {
			//iterate through each message
			Iterator<EntryLogResponse> attempts = blockingStub.entryLogCheck(request);
			
			//client keeps track of next message in stream
			while(attempts.hasNext()) {
				EntryLogResponse current = attempts.next();
				System.out.println("Entry Attempt: ");
				System.out.println(current.getResponse());
				
			}
		} catch (StatusRuntimeException e) {
			e.printStackTrace();
		}
	}
	
	
}
