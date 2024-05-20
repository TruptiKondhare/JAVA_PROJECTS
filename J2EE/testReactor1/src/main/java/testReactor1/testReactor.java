package testReactor1;

import java.util.List;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class testReactor {
	public Mono<String> nameMono(){
		return Mono.just("Trupti").log();
		
	}
	public Flux<String> namesFlux(){
		return Flux.fromIterable(List.of("Rahul","Trupti","Vaish"));
	}
	
	public static void main(String[]args) {
		testReactor testObj=new testReactor();
		//testObj.nameMono().subscribe(name -> System.out.println("Given name is  "+ name));
		testObj.namesFlux().subscribe(names -> System.out.println("Given name are :"+names))	;	
	}

}
