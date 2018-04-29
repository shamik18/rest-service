package controller;

import model.Catalog;
import model.builder.CatalogBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class CatalogController {
    @RequestMapping("/catalogs/{id}")
    public Catalog getCatalog(@PathVariable("id")String id){
        System.out.println(id);
        return  CatalogBuilder.newInstance().withName("Baby Combe").withDescription("This is excellent comb.").build();
    }
}
