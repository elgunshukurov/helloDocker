package az.ms10.helloDocker.service.implementation;

import az.ms10.helloDocker.entity.CounterEnt;
import az.ms10.helloDocker.repository.CounterRepository;
import az.ms10.helloDocker.service.CounterService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CounterImpl implements CounterService {
    private final CounterRepository counterRepository;

    @Override
    public String sayHello() {
        if (counterRepository.findById(1L).isEmpty()) {
            CounterEnt newEntity = new CounterEnt();
            newEntity.setCounter(1);
            counterRepository.save(newEntity);
            return "Hello World! Counter is working... 1";
        } else {
            CounterEnt byId = counterRepository.findById(1L).orElseThrow();
            byId.setCounter(byId.getCounter() + 1);
            counterRepository.save(byId);
            return "Hello World! Counter is working... " + (byId.getCounter());
        }


    }
}
