package bzh.zomzog.prez.apifirst.controller;

import bzh.zomzog.prez.apifirst.controller.api.PoniesApi;
import bzh.zomzog.prez.apifirst.domain.MyPony;
import bzh.zomzog.prez.apifirst.domain.Pony;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class PoniesController implements PoniesApi {

    @Override
    public ResponseEntity<Pony> getOne(String ponyId) {
        Pony pony = new Pony();
        pony.setId( "1" );
        pony.setName( "Rainbow dash" );
        pony.setColor( Pony.ColorEnum.RAINBOW );
        pony.setCreatedAt(100L);
        return ResponseEntity.ok( pony );
    }
}
