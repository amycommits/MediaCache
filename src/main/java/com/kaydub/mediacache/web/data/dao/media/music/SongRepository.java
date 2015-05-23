
package com.kaydub.mediacache.web.data.dao.media.music;

import com.kaydub.mediacache.web.data.entities.media.music.Song;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kevin W
 */
@Repository
@Transactional
public interface SongRepository extends CrudRepository<Song, Long>{

}
