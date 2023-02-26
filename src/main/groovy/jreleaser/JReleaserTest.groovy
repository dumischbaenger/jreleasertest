package jreleaser

import groovy.util.logging.Log4j2

/**
 * JReleaserTest
 * 
 * @author bdonauba
 *
 */
@Log4j2
class JReleaserTest {


  /**
   * Hauptprogramm
   * 
   * @param args
   */
  static main(args) {
    log.info "program started"

    //BD changelog try 5 to kill bug #(1)
    //BD changelog {{repoOwner}}/{{repoName}}#(\d+) dumischbaenger/jreleasertest#(1) #(2)
    
    println "hello jreleaser4 jrelease works along with shadowjar"
 
    log.info "program stopped"
  }
}
