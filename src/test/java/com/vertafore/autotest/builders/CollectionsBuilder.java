package com.vertafore.autotest.builders;

import com.github.javafaker.Faker;
import com.vertafore.autotest.data.model.*;

import java.util.*;


public class CollectionsBuilder {

    private static Faker fake = new Faker();


    public static RootCollectionDTO POSTCollectionsDTO()
    {
        RootCollectionDTO rootCollectionDTO =
                ImmutableRootCollectionDTO.builder()
                        .collection(CreateCollectionDTO())
                        .build();


        return rootCollectionDTO;
    }


    public static CollectionDTO CreateCollectionDTO()
    {
        List<ItemDTO> itemDTO = new ArrayList<ItemDTO>();
        itemDTO.add(CreatePOSTItem());

        CollectionDTO collectionDTO =
                ImmutableCollectionDTO.builder()
                        .info(CreateInfo())
                        .item(itemDTO)
                        .build();


        return collectionDTO;
    }

    public static InfoDTO CreateInfo()
    {

        InfoDTO infoDTO =
                ImmutableInfoDTO.builder()
                    .name(fake.chuckNorris().fact())
                    .description(fake.gameOfThrones().quote())
                    .schema("https://schema.getpostman.com/json/collection/v2.1.0/collection.json")
                .build();

        return infoDTO;
    }


    public static ItemDTO CreatePOSTItem()
    {
        ItemDTO itemDTO =
                ImmutableItemDTO.builder()
                        .name("A POST has a name")
                        .description(fake.book().title())
                        .request(CreatePOSTRequest())
                        .build();

        return itemDTO;
    }

    public static RequestDTO CreatePOSTRequest()
    {
        List<HeaderDTO> headerDTO = new ArrayList<>();
        headerDTO.add(CreatePOSTHeader());

        RequestDTO requestDTO =
                ImmutableRequestDTO.builder()
                        .method("POST")
                        .header(headerDTO)
                        .body(CreatePOSTBody())
                        .geturl("https://postman-echo.com/post")
                        .description(fake.pokemon().name())
                        .build();

        return requestDTO;
    }


    public static HeaderDTO CreatePOSTHeader()
    {
        HeaderDTO headerDTO =
                ImmutableHeaderDTO.builder()
                        .key("Content-Type")
                        .value("application/json")
                        .build();

        return headerDTO;
    }

    public static BodyDTO CreatePOSTBody()
    {
        BodyDTO bodyDTO =
                ImmutableBodyDTO.builder()
                        .mode("raw")
                        .raw("{\"data\": " + fake.lordOfTheRings().location() + "}")
                        .build();

        return bodyDTO;
    }


}
