package utility;

import data.initial.LabWork;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class Response implements Serializable {
    private String serverMessage;
    private LinkedHashSet<LabWork> collection;
    private long maxIdInCollection;

    public Response(String serverMessage) {
        this.serverMessage = serverMessage;
    }

    public Response(String serverMessage, long maxIdInCollection) {
        this.serverMessage = serverMessage;
        this.maxIdInCollection = maxIdInCollection;
    }

    public long getMaxIdInCollection() {
        return maxIdInCollection;
    }

    public Response(LinkedHashSet<LabWork>  collection) {
        this.collection = collection;
    }

    @Override
    public String toString() {
        return (collection == null ? serverMessage : collection.stream().map(LabWork::toString)
                .collect(Collectors.joining("\n")));
    }
}
