package br.com.luis.restwithspringboot.controllers;

import br.com.luis.restwithspringboot.exceptions.UnsupportedMathOperationException;
import br.com.luis.restwithspringboot.maths.MathOperations;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static br.com.luis.restwithspringboot.utils.NumericUtils.convertToDouble;
import static br.com.luis.restwithspringboot.utils.NumericUtils.isNumeric;

@RestController
public class MathController {

    private MathOperations mathOperations = new MathOperations();

    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.sum(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/subtraction/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double subtraction(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.subtraction(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/multiplication/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double multiplication(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.multiplication(convertToDouble(numberOne), convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/division/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double division(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.division(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/avg/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double avg(@PathVariable("numberOne") String numberOne, @PathVariable("numberTwo") String numberTwo) {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.avg(convertToDouble(numberOne),convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sqrt/{numberOne}", method = RequestMethod.GET)
    public Double sqrt(@PathVariable("numberOne") String numberOne){
        if (!isNumeric(numberOne)) {
            throw new UnsupportedMathOperationException("Please, set a valid numeric value.");
        }
        return mathOperations.sqrt(convertToDouble(numberOne));
    }

}
