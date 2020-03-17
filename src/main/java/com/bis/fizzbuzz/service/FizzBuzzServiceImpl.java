package com.bis.fizzbuzz.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static com.bis.fizzbuzz.domain.Constant.*;

/**
 * Provides business service implementation for FizzBuzz algorithm
 */
@Service
public class FizzBuzzServiceImpl implements FizzBuzzService {

    private static Logger LOG = LoggerFactory
            .getLogger(FizzBuzzServiceImpl.class);


    /**
     * Provides implementation for FizzBuzz business process
     *
     * @param theNumberToProcess input parameter used for processing
     * @return Aggregated output for FizzBuzz business process
     */
    @Override
    public String process(Integer theNumberToProcess) {
        LOG.info("EXECUTING : process [{}]\n", theNumberToProcess);
        Optional<Integer> numberToProcess = Optional.ofNullable(theNumberToProcess);
        if (numberToProcess.isPresent()) {
            return numberToProcess
                    .map(number ->
                    {
                        final StringBuilder fizzBuzzCombinedText = new StringBuilder();
                        if (number > 0 && number % FIZZNUMBER == 0) {
                            fizzBuzzCombinedText.append(FIZZTEXT);
                        }

                        if (number > 0 && number % BUZZNUMBER == 0) {
                            fizzBuzzCombinedText.append(BUZZTEXT);
                        }

                        if (fizzBuzzCombinedText.length() == 0) {
                            fizzBuzzCombinedText.append(number.toString());
                        }
                        return fizzBuzzCombinedText.toString();
                    }).get();

        }
        return "";
    }

    /**
     * Provides implementation for FizzBuzz business process
     *
     * @param theNumberToProcess input parameter used for processing
     * @return Aggregated output for FizzBuzz business process
     */
    @Override
    public String advanceProcess(Integer theNumberToProcess) {
        LOG.info("EXECUTING : advanceProcess [{}]\n", theNumberToProcess);
        Optional<Integer> numberToProcess = Optional.ofNullable(theNumberToProcess);
        if (numberToProcess.isPresent()) {
            return numberToProcess
                    .map(number ->
                    {
                        final StringBuilder fizzBuzzCombinedText = new StringBuilder();
                        if (number > 0 && ((number % FIZZNUMBER == 0) || (number.toString().contains(FIZZNUMBERTEXT)))) {
                            fizzBuzzCombinedText.append(FIZZTEXT);
                        }

                        if (number > 0 && ((number % BUZZNUMBER == 0) || (number.toString().contains(BUZZNUMBERTEXT)))) {
                            fizzBuzzCombinedText.append(BUZZTEXT);
                        }

                        if (fizzBuzzCombinedText.length() == 0) {
                            fizzBuzzCombinedText.append(number.toString());
                        }
                        return fizzBuzzCombinedText.toString();
                    }).get();

        }
        return "";

    }
}
