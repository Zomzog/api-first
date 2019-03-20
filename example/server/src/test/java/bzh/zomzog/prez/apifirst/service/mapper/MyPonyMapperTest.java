package bzh.zomzog.prez.apifirst.service.mapper;

import bzh.zomzog.prez.apifirst.domain.MyPony;
import bzh.zomzog.prez.apifirst.domain.Pony;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyPonyMapperTest {

    //private MyPonyMapper myPonyMapper = Mappers.getMapper(MyPonyMapper.class);
    private MyPonyMapper myPonyMapper = new MyPonyMapperImpl(new NativeMapperImpl());

    @Test
    void mapPony() {
        Pony pony = new Pony();
        pony.setId( "1" );
        pony.setName( "Rainbow dash" );
        pony.setColor( Pony.ColorEnum.RAINBOW );
        pony.setCreatedAt(3600L);

        MyPony result = myPonyMapper.map(pony);
        assertEquals(1L, result.getId());
        assertEquals("Rainbow dash", result.getName() );
        assertEquals("RAINBOW", result.getColor());
        assertEquals(LocalDateTime.of(1970, 1, 1, 1, 0, 0), result.getCreatedAt());
    }

    @Test
    void update() {
        Pony pony = new Pony();
        pony.setId( "1" );
        pony.setName( "Rainbow dash" );
        pony.setColor( Pony.ColorEnum.RAINBOW );
        pony.setCreatedAt(3600L);

        MyPony myPony = MyPony.builder().id(1).build();
        myPony.setHiddenField("magic");

        MyPony result = myPonyMapper.update(pony, myPony);
        assertEquals(1L, result.getId());
        assertEquals("Rainbow dash", result.getName() );
        assertEquals("RAINBOW", result.getColor());
        assertEquals(LocalDateTime.of(1970, 1, 1, 1, 0, 0), result.getCreatedAt());
        assertEquals("magic", result.getHiddenField());
    }

    @Test
    void updateIgnoreId() {
        Pony pony = new Pony();
        pony.setId( "2" );
        pony.setName( "Rainbow dash" );
        pony.setColor( Pony.ColorEnum.RAINBOW );
        pony.setCreatedAt(3600L);

        MyPony myPony = MyPony.builder().id(1).build();
        myPony.setHiddenField("magic");

        MyPony result = myPonyMapper.update(pony, myPony);
        assertEquals(1L, result.getId());
        assertEquals("Rainbow dash", result.getName() );
        assertEquals("RAINBOW", result.getColor());
        assertEquals(LocalDateTime.of(1970, 1, 1, 1, 0, 0), result.getCreatedAt());
        assertEquals("magic", result.getHiddenField());
    }

}