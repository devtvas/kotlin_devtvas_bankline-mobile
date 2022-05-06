package br.com.devtvas.bankline.domain

data class Movimentacao(

    val id:Int,
    val dataHora: String,
    val descricao: String,
    val valor:Number,
    val movimentacaoTipo: TipoMovimentacao,
    //TODO  Mapear "idConta -> idCorrentista"
    val idCorrentista: Int,

    )
