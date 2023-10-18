package com.example.sbcar2;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource ;
/**
 * CarRepository
 */
@RepositoryRestResource
 public interface CarRepository extends  CrudRepository<Car, Long> {
    
    List<Car> findByBrand(@Param("brand") String brand);
    List<Car> findByColor(@Param("color") String color);
    List<Car> findByBrandAndModel(String brand,String model );
    List<Car> findByBrandOrColor(String brand,String color );
    // @Query("select * from Car where model= ?1")
    List<Car> findByModel(@Param("model")String model);

    
}
