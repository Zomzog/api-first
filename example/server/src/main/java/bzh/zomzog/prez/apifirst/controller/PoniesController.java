package bzh.zomzog.prez.apifirst.controller;

import bzh.zomzog.prez.apifirst.controller.api.PoniesApi;
import bzh.zomzog.prez.apifirst.domain.Pony;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PoniesController implements PoniesApi {

    @Override
    public ResponseEntity<Pony> getOne(String ponyId) {
        Pony pony = new Pony();
        pony.setId( "1" );
        pony.setName( "Rainbow dash" );
        pony.setColor( Pony.ColorEnum.RAINBOW );
        return ResponseEntity.ok( pony );
    }
}
