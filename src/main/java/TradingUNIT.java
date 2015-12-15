/**
 * Created by Юля on 11.12.2015.
 */
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "trading_unit")
public class TradingUNIT {

    @Id
    @Column(name="ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idUNIT;

    @Column(name = "unit_name", length = 32)
    private String unitName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_category")
    private Category category;


}
