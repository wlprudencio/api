package med.voll.api.domain.paciente;

public class Paciente {
   /* @Getter
    @EqualsAndHashCode(of = "id")
    @NoArgsConstructor
    @AllArgsConstructor
    @Entity(name = "Paciente")
    @Table(name = "pacientes")
    public class Paciente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nome;
        private String email;
        private String cpf;
        private String telefone;

        @Embedded
        private Endereco endereco;

        public Paciente(DadosCadastroPaciente dados) {
            this.nome = dados.nome();
            this.email = dados.email();
            this.telefone = dados.telefone();
            this.cpf = dados.cpf();
            this.endereco = new Endereco(dados.endereco());
        }

    }
*/
}
