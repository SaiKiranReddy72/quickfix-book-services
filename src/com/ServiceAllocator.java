import java.util.*;

public class ServiceAllocator {
    PriorityQueue<Service> pq;

    public ServiceAllocator() {
        pq = new PriorityQueue<>((a, b) -> b.rating - a.rating); // max heap by rating
    }

    public void addService(Service s) {
        pq.add(s);
    }

    public Service getBestRepairer(String type, String location) {
        for (Service s : pq) {
            if (s.type.equals(type) && s.location.equals(location)) {
                return s;
            }
        }
        return null;
    }
}
