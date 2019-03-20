package bzh.zomzog.prez.apifirst.service.mapper;

import org.mapstruct.Mapper;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Mapper
public abstract class NativeMapper {

    public LocalDateTime map(Long l) {
        return LocalDateTime.ofEpochSecond(l, 0, ZoneOffset.UTC);
    }
}
