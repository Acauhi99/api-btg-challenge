package acauhi.btgpactual.orderms.dto;

import java.math.BigDecimal;
import java.util.List;

public record OrderCreatedEvent(Long codigoPedido, Long codigoCliente, List<OrderItemEvent> itens, BigDecimal total) {

}
