package cn.lujango.beanmapping.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @Author: Lujango
 * @Date: 2021/5/11 10:32 上午
 */
@Mapper
public interface CarMapper {
  CarMapper INSTANCE = Mappers.getMapper( CarMapper.class );

  @Mapping(target = "seatCount", source = "numberOfSeats")
  CarDto carToCarDto(Car car);

}
