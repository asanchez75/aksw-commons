package org.aksw.commons.jena.sparql;

import org.aksw.commons.sparql.core.AA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Sebastian Hellmann - http://bis.informatik.uni-leipzig.de/SebastianHellmann
 * Date: 13.03.11
 */
public class SampleSparqlEndpoint {

    public static void main(String[] args) {
        List<String> aaaa = new ArrayList <String> ();
        AA a = new AA();
        a.some(aaaa);
        //Set("http://dbpedia.org")
        Set<String> s = new HashSet<String>();
       // HttpSparqlEndpoint coreEndpoint = new HttpSparqlEndpoint("http://dbpedia.org/sparql", s);

        //val r = coreEndpoint.executeSelect( "Select ?s ?p ?o From <http://dbpedia.org> { ?s ?p ?p . } Limit 10")

        //print(r)

    }
}