using System.ComponentModel.DataAnnotations;

namespace Biblioteca.Models
{
    public class Editora
    {
        [Key]
        [MaxLength(50, ErrorMessage = "O campo gênero não pode exceder 50 caracteres")]
        public int Id { get; set; }

        [MaxLength(200, ErrorMessage = "O campo nome não pode exceder 200 caracteres")]
        public string Nome { get; set; }

    }
}
