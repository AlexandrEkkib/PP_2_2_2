package web.model;

import java.util.List;

public interface CarsService {
      List<Cars> carsList = List.of(
            new Cars(1000,"MB", 100),
        new Cars(1001,"MB", 100),
        new Cars(1002,"MB", 102),
        new Cars(1003,"MB", 104),
        new Cars(1004,"MB", 102));
   List<Cars> carsCount(Integer number);
}
