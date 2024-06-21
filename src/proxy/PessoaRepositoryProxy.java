package proxy;

import builder.Pessoa;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class PessoaRepositoryProxy  extends PessoaRepository{
    private static Logger log = Logger.getLogger(PessoaRepositoryProxy.class.getName());

    private Map<Long, Pessoa> cache = null;

    @Override
    public void save(Pessoa pessoa) {
        log.info("Iniciando método save...");
        super.save(pessoa);
        log.info("Fim do método save.");
    }

    @Override
    public Pessoa findById(Long id) {
        log.info("Iniciando método findById...");
        long inicio = System.currentTimeMillis();
        Pessoa pessoa = null;
        if(Objects.isNull(cache)){
            pessoa = super.findById(id);
            cache = new HashMap<>();
            cache.put(id,pessoa);
        }else{
            log.info("Procurando no cache...");
            pessoa = cache.get(id);
        }
        long fim = System.currentTimeMillis();
        log.info("Fim do método findById. Tempo de execução: "+(fim-inicio));
        return pessoa;
    }
}
