package kitchenpos.product.fixture;

import kitchenpos.product.domain.Product;

import java.math.BigDecimal;
import java.util.UUID;

public class ProductFixture {

    public static Product product() {
        return product("후라이드", 16_000L);
    }

    public static Product product(final String name, final long price) {
        final Product product = new Product();
        product.setId(UUID.randomUUID());
        product.setName(name);
        product.setPrice(BigDecimal.valueOf(price));
        return product;
    }
}