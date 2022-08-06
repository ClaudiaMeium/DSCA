package ds.service2;

import java.io.IOException;

import ds.service2.Service2Grpc.Service2ImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

//this class extends the implbase imported class - the interface file with rpc methods
public class Service2 extends Service2ImplBase{


//main method to start the server
	public static void main(String[] args) throws InterruptedException, IOException {
		
		//instance of class Service one by which to invoke methods 
		Service2 service1 = new Service2();

		//port where we will listen to clients
		int port = 50055;

		//creating the server on the port, and attaching instance of Service1 to it 
		Server server = ServerBuilder.forPort(port) //port we defined earlier
				.addService(service1)//adding the service
				.build()//building the server
				.start();//starting the service.  it will keep running for clients to connect

		//showing that the service is started
		System.out.println("Service-2 started, listening on " + port);

		//service will run until terminated 
		server.awaitTermination();
	}

	//rpc methods defined in proto files 
	@Override
	public StreamObserver<TempRequest> tempModifier(StreamObserver<TempResponse> responseObserver) {
		// TODO Auto-generated method stub
		return super.tempModifier(responseObserver);
	}

	@Override
	public StreamObserver<HumidRequest> humidModifier(StreamObserver<HumidResponse> responseObserver) {
		// TODO Auto-generated method stub
		return super.humidModifier(responseObserver);
	}

	@Override
	public StreamObserver<LightRequest> lightModifier(StreamObserver<LightResponse> responseObserver) {
		// TODO Auto-generated method stub
		return super.lightModifier(responseObserver);
	}

	@Override
	public void tempStatusCheck(TempStatRequest request, StreamObserver<TempStatResponse> responseObserver) {
		
		//notifying what is happening
		System.out.println("Receiving status request: " + request.getRequest());
		
		//designate top and bottom values from which to find our current randomly generated temperature 
		double bottom = 15;
		double top = 25;
		//find randomly generated temperate and convert to long since this method does not work for longs
		long random = (long)Math.floor(Math.random()*(top-bottom+1)+bottom);
		
		//prepare response by building and inputting value of random
		TempStatResponse response = TempStatResponse.newBuilder().setReponse(random).build();
		
		//sending reply for each request
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
		
		//super.tempStatusCheck(request, responseObserver);
	}

	@Override
	public void humidStatusCheck(HumidStatRequest request, StreamObserver<HumidStatResponse> responseObserver) {
		
		//notifying what is happening
		System.out.println("Receiving status request: " + request.getRequest());
		
		//designate top and bottom values from which to find our current randomly generated humidity level 
		double bottom = 35;
		double top = 75;
		//find randomly generated temperate and convert to long since this method does not work for longs
		long random = (long)Math.floor(Math.random()*(top-bottom+1)+bottom);
		
		//prepare response by building and inputting value of random
		HumidStatResponse response = HumidStatResponse.newBuilder().setResponse(random).build();
		
		//sending reply for each request
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();
	
		//super.humidStatusCheck(request, responseObserver);
	}

	@Override
	public void lightStatusCheck(LightStatRequest request, StreamObserver<LightStatResponse> responseObserver) {
		
		//notifying what is happening
		System.out.println("Receiving status request: " + request.getRequest());
		
		//designate top and bottom values from which to find our current randomly generated light saturation
		double bottom = 50;
		double top = 100;
		//find randomly generated temperate and convert to long since this method does not work for longs
		long random = (long)Math.floor(Math.random()*(top-bottom+1)+bottom);
		
		//prepare response by building and inputting value of random
		LightStatResponse response = LightStatResponse.newBuilder().setResponse(random).build();
		
		//sending reply for each request
		responseObserver.onNext(response);
		
		responseObserver.onCompleted();

		//super.lightStatusCheck(request, responseObserver);
	}


/*	@Override
	public void service2Do(RequestMessage request, StreamObserver<ResponseMessage> responseObserver) {

		//prepare the value to be set back
		int length = request.getText().length();
		
		//preparing the response message
		ResponseMessage reply = ResponseMessage.newBuilder().setLength(length).build();

		responseObserver.onNext( reply ); 

		responseObserver.onCompleted();

	}*/
}
