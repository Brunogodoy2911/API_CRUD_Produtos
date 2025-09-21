package com.brunogodoy.productcrud.exceptions;

public class ResourceNotFound extends RuntimeException {

  public ResourceNotFound(String message) {
    super(message);
  }

}