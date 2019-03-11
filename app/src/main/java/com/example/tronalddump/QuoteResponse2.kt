package com.example.tronalddump

import com.google.gson.annotations.SerializedName

data class QuoteResponse2(
        val _embedded: Embedded,
        val _links: Links,
        val count: Int,
        val total: Int
)

data class Links(
        val first: First,
        val last: Last,
        val next: Next,
        val prev: Prev,
        val self: Self
)

data class Last(
        val href: String
)

data class Self(
        val href: String
)

data class First(
        val href: String
)

data class Prev(
        val href: String
)

data class Next(
        val href: String
)

data class Embedded(
        val quotes: List<Quote2>
)

data class Quote2(
        @SerializedName("_embedded") val embedded: EmbeddedX,
        @SerializedName("_links") val _links: LinksX,
        val appeared_at: String,
        val created_at: String,
        val quote_id: String,
        val tags: List<String>,
        val updated_at: String,
        val value: String
)

data class EmbeddedX(
        val author: List<Author>,
        val source: List<Source>
)

data class Author(
        val author_id: String,
        val bio: Any,
        val created_at: String,
        val name: String,
        val slug: String,
        val updated_at: String
)

data class Source(
        val created_at: String,
        val filename: Any,
        val quote_source_id: String,
        val remarks: Any,
        val updated_at: String,
        val url: String
)

data class LinksX(
        val self: Self
)