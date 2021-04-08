package com.example.graphqldemo;

import com.example.graphqldemo.model.Show;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsData;
import com.netflix.graphql.dgs.InputArgument;

import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class ShowDataFetcher {

    private final List<Show> SHOWS = List.of(
            new Show("Stranger Things",  2016),
            new Show("Ozark",  2017),
            new Show("The Crown",  2016),
            new Show("Dead To Me",  2019),
            new Show("Orange is the new Black",  2013)
    );

    @DgsData(parentType =  "Query", field = "shows")
    public List<Show> shows(@InputArgument("titleFilter") String titleFilter) {
        if (titleFilter == null) {
            return SHOWS;
        }

        return SHOWS.stream().filter(s -> s.getTitle().contains(titleFilter)).collect(Collectors.toList());
    }
}
