package az.ms10.helloDocker.repository;

import az.ms10.helloDocker.entity.CounterEnt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CounterRepository extends JpaRepository<CounterEnt, Long> {

}
