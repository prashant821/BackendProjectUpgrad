package com.upgrad.FoodOrderingApp.api.exception;

import com.upgrad.FoodOrderingApp.api.model.ErrorResponse;
import com.upgrad.FoodOrderingApp.service.exception.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RestExceptionHandler {
  private ErrorResponse errorResponse = new ErrorResponse();

  @ExceptionHandler(SignUpRestrictedException.class)
  public ResponseEntity<ErrorResponse> signUpRestrictedException(
      SignUpRestrictedException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(AuthenticationFailedException.class)
  public ResponseEntity<ErrorResponse> authenticationFailedException(
      AuthenticationFailedException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.UNAUTHORIZED);
  }

  @ExceptionHandler(AuthorizationFailedException.class)
  public ResponseEntity<ErrorResponse> authorizationFailedException(
      AuthorizationFailedException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.FORBIDDEN);
  }

  @ExceptionHandler(UpdateCustomerException.class)
  public ResponseEntity<ErrorResponse> updateCustomerException(
      UpdateCustomerException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(AddressNotFoundException.class)
  public ResponseEntity<ErrorResponse> addressNotFoundException(
      AddressNotFoundException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(SaveAddressException.class)
  public ResponseEntity<ErrorResponse> saveAddressException(
      SaveAddressException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(CouponNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleCouponNotFoundException(CouponNotFoundException e) {

    errorResponse.setCode(e.getCode());
    errorResponse.setMessage(e.getErrorMessage());
    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(PaymentMethodNotFoundException.class)
  public ResponseEntity<ErrorResponse> handlePaymentNotFoundException(
      PaymentMethodNotFoundException e) {

    errorResponse.setCode(e.getCode());
    errorResponse.setMessage(e.getErrorMessage());
    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(RestaurantNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleRestaurantNotFoundException(
      RestaurantNotFoundException e) {

    errorResponse.setCode(e.getCode());
    errorResponse.setMessage(e.getErrorMessage());
    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(ItemNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleItemNotFoundException(ItemNotFoundException e) {

    errorResponse.setCode(e.getCode());
    errorResponse.setMessage(e.getErrorMessage());
    return new ResponseEntity<>(errorResponse, HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(CategoryNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleCategoryNotFoundException(
      CategoryNotFoundException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.NOT_FOUND);
  }

  @ExceptionHandler(InvalidRatingException.class)
  public ResponseEntity<ErrorResponse> invalidRatingException(
      InvalidRatingException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(CustomerNotFoundException.class)
  public ResponseEntity<ErrorResponse> handleCategoryNotFoundException(
      CustomerNotFoundException exe, WebRequest request) {
    return new ResponseEntity<ErrorResponse>(
        new ErrorResponse().code(exe.getCode()).message(exe.getErrorMessage()),
        HttpStatus.NOT_FOUND);
  }
  }