package org.aksw.commons.sparql.api.dereference;

import org.aksw.commons.sparql.api.core.QueryExecutionFactoryBackQuery;
import org.aksw.commons.sparql.api.core.QueryExecutionStreaming;

import com.hp.hpl.jena.query.Query;

/**
 * @author Claus Stadler
 *         <p/>
 *         Date: 11/29/11
 *         Time: 12:42 AM
 */
public class QueryExecutionFactoryDereference
    extends QueryExecutionFactoryBackQuery
{
    public static final String DEFAULT_ID = "http://aksw.org/ontology/WebOfData";

    private String id;
    private Dereferencer dereferencer;

    public QueryExecutionFactoryDereference(Dereferencer dereferencer) {
        this(dereferencer, DEFAULT_ID);
    }

    public QueryExecutionFactoryDereference(Dereferencer dereferencer, String id) {
        this.dereferencer = dereferencer;
        this.id = id;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getState() {
        return "";
    }

    public Dereferencer getDereferencer()
    {
        return dereferencer;
    }

    @Override
    public QueryExecutionStreaming createQueryExecution(Query query) {
        return new QueryExecutionDereference(query, dereferencer);
    }
}
