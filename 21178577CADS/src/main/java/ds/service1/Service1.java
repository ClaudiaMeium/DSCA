package ds.service1;

import java.io.IOException;
import java.util.Random;
import java.util.logging.Logger;

import ds.service1.EntryResponse.Builder;
import ds.service1.Service1Grpc.Service1ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;


public class Service1 extends Service1ImplBase{

	//create a logger to show server side logs in the console
	private static final Logger logger = Logger.getLogger(Service1.class.getName());

	public static void main(String[] args) throws InterruptedException, IOException {
		
		//instance of class Service1, to invoke methods thereby
		Service1 service1 = new Service1();

		//port number where server will listen to clients
		int port = 50055;

		//create a server on the port defined in our port variable and attach our service to it
		Server server = ServerBuilder.forPort(port)
				.addService(service1) //service1 instance
				.build() //building the server
				.start(); //starting the server; it will continue running for clients to connect

		//update to console that server has started
		System.out.println("Electronic Access Service started, listening on " + port);
		
		//or could do a logger instance thereof?
		//Logger.info("Server started, listening on " + port);

		server.awaitTermination();
	}

	//method from proto file - unary
	@Override
	public void authoriseEntry(EntryRequest request, StreamObserver<EntryResponse> responseObserver) {
		// TODO Auto-generated method stub
		
		//Acknowledging entry request
		System.out.println("Entry Request: " + request.getRequest());
		String attempt = request.getRequest();
		
		/*this if want to have randomly generated options to compare to
		take the below and then do a arrayaslist contains to check if request matches array
		however, the chances of it matching when both attempt and codes are randomly
		generated is minimal, so maybe better logic exists?*/
	/*	int left = 48; // for number '0' (beginning of int possibilities)
	    int right = 122; // for letter 'z' (end of letter possibilities)
	    int codeLength = 4;
	    Random random = new Random();

	    String[] correct = new String[10];
	    System.out.println("check before loop");
	    for (int j = 0; j < correct.length-1; j++) {
	    	String codeAttempt = random.ints(left, right + 1)
	    	//filter used to leave out Unicode characters between 65 and 90 to avoid out of range characters
	    			.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    			.limit(codeLength)
	    			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    			.toString();
	    	correct[j] = codeAttempt;
	    	responseObserver.onNext(EntryLogResponse.newBuilder().setResponse(codeAttempt).build());	
	    }*/
		
		String correct = "1234"; //maybe there should be more than one correct (like, each person has own?)
		//EntryResponse response;
	
		if (attempt.equalsIgnoreCase(correct)) {
			System.out.println("true attempt");
			EntryResponse response = EntryResponse.newBuilder().setAuthorised(true).build();
			responseObserver.onNext(response);
		} else {
			System.out.println("false attempt");
			EntryResponse response = EntryResponse.newBuilder().setAuthorised(false).build();
			responseObserver.onNext(response);
		}
		
		
		
		responseObserver.onCompleted();
			
		//super.authoriseEntry(request, responseObserver);
	}

	@Override
	public void entryLogCheck(EntryLogRequest request, StreamObserver<EntryLogResponse> responseObserver) {
		//notify of request received 
		System.out.println("Receiving request: " + request.getRequest());
		
		//generating random alphanumeric four character sequences
		//make sure fully understand this so can comment it properly.
		
		int left = 48; // for number '0' (beginning of int possibilities)
	    int right = 122; // for letter 'z' (end of letter possibilities)
	    int codeLength = 4;
	    Random random = new Random();

	    String[] log = new String[10];
	    System.out.println("check before loop");
	    for (int j = 0; j < log.length-1; j++) {
	    	String codeAttempt = random.ints(left, right + 1)
	    	//filter used to leave out Unicode characters between 65 and 90 to avoid out of range characters
	    			.filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	    			.limit(codeLength)
	    			.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	    			.toString();
	    	log[j] = codeAttempt;
	    	responseObserver.onNext(EntryLogResponse.newBuilder().setResponse(codeAttempt).build());
	    	
	    	
	    }
	    
		responseObserver.onCompleted();
		
		
		
		// TODO Auto-generated method stub
		//super.entryLogCheck(request, responseObserver);
	}


/*	@Override
	public void service1Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}*/
}
