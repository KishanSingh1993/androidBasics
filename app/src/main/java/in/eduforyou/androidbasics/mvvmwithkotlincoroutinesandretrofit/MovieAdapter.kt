package `in`.eduforyou.androidbasics.mvvmwithkotlincoroutinesandretrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import `in`.eduforyou.androidbasics.databinding.AdapterMovieBinding

class MovieAdapter : RecyclerView.Adapter<MainViewHolder>() {

    var movieList = mutableListOf<Movie>()

    fun setMovies(movies: List<Movie>) {
        this.movieList = movies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val binding = AdapterMovieBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {

        val movie = movieList[position]
        if (ValidationUtil.validateMovie(movie)) {
            holder.binding.name.text = movie.name
            //Glide.with(holder.itemView.context).load(movie.imageUrl).into(holder.binding.ivMovie)
            Picasso.get().load(movie.imageUrl).into(holder.binding.ivMovie)
        }
    }

    override fun getItemCount(): Int {
        return movieList.size
    }
}

class MainViewHolder(val binding: AdapterMovieBinding) : RecyclerView.ViewHolder(binding.root) {

}