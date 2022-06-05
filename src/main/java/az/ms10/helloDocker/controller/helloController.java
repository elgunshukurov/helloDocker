package az.ms10.helloDocker.controller;

import az.ms10.helloDocker.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/index")
@RequiredArgsConstructor
public class helloController {
    private final CounterService service;

    @GetMapping("/")
    public String sayHello(){
        return service.sayHello();
    }


//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    public TravellerDto createTraveller(@Valid @RequestBody TravellerRequestDto travellerRequestDto){
//        return  service.createTraveller(travellerRequestDto);
//    }
//
//    @PutMapping("/{id}")
//    public TravellerDto updateTraveller(@PathVariable Long id, @Valid @RequestBody TravellerRequestDto travellerRequestDto){
//        return  service.createTraveller(travellerRequestDto);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public void deleteTraveller(@PathVariable Long id){
//        service.deleteTraveller(id);
//    }

}
