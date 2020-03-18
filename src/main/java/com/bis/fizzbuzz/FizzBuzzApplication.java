package com.bis.fizzbuzz;

import com.bis.fizzbuzz.service.FizzBuzzService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.IntStream;

/**
 * FizzBuzz Program to output Fizz, Buzz or FizzBuzz.
 * Business Rules 1: if a number can be divided by 3 then output Fizz
 * Business Rules 2: if a number can be divided by 5 then output Fizz
 * Business Rules 3: if a number can be divided by 3 and 5 then output FizzBuzz
 * Special Business Rules 1: if a number contains  3 or can be divided by 3  then output Fizz
 * Special Business Rules 1: if a number contains  5 or can be divided by 5  then output Buzz
 * Special Business Rules 1: if a number contains  3 or 5 rr can be divided by 3 or 5 then output FizzBuzz
 */
@SpringBootApplication
public class FizzBuzzApplication implements CommandLineRunner {

    private FizzBuzzService fizzBuzzService;

    /**
     * Logging events for FizzBuzz service
     */
    private static Logger LOG = LoggerFactory
            .getLogger(FizzBuzzApplication.class);

    /**
     * Injecting service based on constructor based injection.
     * @param fizzBuzzService injected by Spring DI
     */
    public FizzBuzzApplication(final FizzBuzzService fizzBuzzService) {
        this.fizzBuzzService = fizzBuzzService;
    }

    /**
     * Entry point for Spring Boot Application.
     * @param args command line input parameters
     */
    public static void main(String[] args) {
        LOG.info("STARTING THE FizzBuzzApplication");
        SpringApplication.run(FizzBuzzApplication.class, args);
        LOG.info("FizzBuzzApplication FINISHED");
    }

    /**
     * Running our business requirement for FizzBuzz service.
     * @param  args command line input parameters
     */
    @Override
    public void run(String... args) {
        LOG.info("EXECUTING : simple fizzbuzz process test\n");

        IntStream.rangeClosed(1, 100).forEach(i -> {
            LOG.info("{}: {}\n", i, fizzBuzzService.process(i));
        });

        LOG.info("END : simple fizzbuzz process test\n");

        LOG.info("EXECUTING : advance fizzbuzz process test\n");

        IntStream.rangeClosed(1, 100).forEach(i -> {
            LOG.info("{}: {}\n", i, fizzBuzzService.advanceProcess(i));
        });

        LOG.info("END : advance fizzbuzz process test\n");
    }
}
