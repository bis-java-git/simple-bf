package com.bis.fizzbuzz.service;

/**
 * Provides business service interface for FizzBuzz algorithm
 */
public interface FizzBuzzService {
    /**
     *
     * @param numberToProcess input parameter used for processing
     * @return business output as a string
     */
    String process(final Integer numberToProcess);

    /**
     *
     * @param numberToProcess input parameter used for processing
     * @return business output as a string
     */
    String advanceProcess(final Integer numberToProcess);

}
