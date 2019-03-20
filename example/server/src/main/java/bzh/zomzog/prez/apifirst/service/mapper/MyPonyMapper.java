package bzh.zomzog.prez.apifirst.service.mapper;

import bzh.zomzog.prez.apifirst.domain.MyPony;
import bzh.zomzog.prez.apifirst.domain.Pony;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR, uses = NativeMapper.class)
public abstract class MyPonyMapper {

    public abstract MyPony map(Pony pony);

    @Mapping(target = "id", ignore = true)
    public abstract MyPony update(Pony pony, @MappingTarget MyPony myPony);
}
