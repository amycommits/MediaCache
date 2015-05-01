
package com.kaydub.mediacache.web.data.dao.settings;

import com.kaydub.mediacache.web.data.entities.settings.AppSetting;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author AMY
 */
@Repository
@Transactional
public interface AppSettingsRepository extends CrudRepository<AppSetting, String> {
    
}
