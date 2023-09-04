package kitchenpos.order.eatinorder.domain;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface EatInOrderRepository {
    EatInOrder save(EatInOrder eatInOrder);

    Optional<EatInOrder> findById(UUID id);

    List<EatInOrder> findAll();

    boolean existsByRestaruantTableAndStatusNot(RestaurantTable restaurantTable, EatInOrderStatus status);
}

