package cn.lujango.beanmapping.mapstruct;

/**
 * @Author: Lujango
 * @Date: 2021/5/11 10:29 上午
 */
public class MapStructMain {

  public static void main(String[] args) {
    CarDto carDto = CarMapper.INSTANCE.carToCarDto(new Car("111"));
    System.out.println(carDto);
    System.out.println(carDto);
  }
}
