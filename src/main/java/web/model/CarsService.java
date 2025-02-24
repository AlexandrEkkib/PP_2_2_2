package web.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;



public interface CarsService {
    List<Cars> carsList = new ArrayList<>();
   List<Cars> carsCount(Integer number);
}
